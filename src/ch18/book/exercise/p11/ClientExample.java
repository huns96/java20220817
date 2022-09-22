package ch18.book.exercise.p11;

import java.io.File;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = new Socket("local host", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\output\\cat.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] arr = new byte[100];
		fileName.getBytes(0, fileName, length(), arr, 0);
		os.write(arr);
		
		
		
		System.out.println("[파일 보내기 시작]" + fileName);
		
		
		
		
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
