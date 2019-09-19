package vidya.com.net;

import java.net.*;
import java.io.*;

public class SimpleTCPClient {
	public static void main(String[] args) throws IOException {
		String hostname = "94.142.241.111";
		int port = 23;

		Socket socket = new Socket(hostname, port);
		System.out.println("Connected to server...");

		InputStream in = socket.getInputStream();

		byte[] bytesRcvd = new byte[2048];
		int byteCount = in.read(bytesRcvd);
		while(byteCount != -1) {
			System.out.println(new String(bytesRcvd));
			byteCount = in.read(bytesRcvd);
		}
		in.close();
		socket.close(); // Close the socket and its streams
	}
}
