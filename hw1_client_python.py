import socket
HOST = '94.142.241.111'
PORT = 23

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    retVal = s.connect((HOST, PORT))
    if (retVal!=None):
        print("Error in Socket Connection!! Exiting")
        s.close()
    while (True):
        data = s.recv(1024)
        print(str(data))
