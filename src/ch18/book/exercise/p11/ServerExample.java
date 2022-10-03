package ch18.book.exercise.p11;

import java.io.InputStream;
import java.net.ServerSocket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = new ServerSocket();
		server.Socket.bind(new InetSocketAddress("localhost", 5001));
		
		System.out.println("[서버 시작]");
		
		try {
			Socket socket = serverSocket.accept();
			
			InputStream is = socket.getInputStream();
			
			byte[] byte = new byte[100];
			int readByteCount = -1;
			
			is.read(bytes);
			String fileName.trim();
			
			System.out.println("[파일 받기 시작]" + fileName);
			

			while ((readByteCount = is.read(bytes)) != -1) {
				fos.
			}
			
		}
	}
}
