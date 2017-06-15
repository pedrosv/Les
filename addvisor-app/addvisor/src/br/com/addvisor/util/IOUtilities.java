package br.com.addvisor.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOUtilities {

	public static void write(String path, String nameFile, String content) throws IOException {
		File file = new File(path, nameFile);

		if (file.exists()) {
			file.delete();
		}

		FileOutputStream out = new FileOutputStream(file, true);
		out.write(content.getBytes());
		out.flush();
		out.close();
	}

	public static String read(String absolutePath) {
		BufferedReader in;
		String text = "";
		try {
			in = new BufferedReader(new FileReader(absolutePath));
			while (in.ready()) {
				text = text + in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	public static boolean logout(String path, String nameFile) {
		File file = new File(path, nameFile);

		if (file.exists()) {
			file.delete();
			return true;
		} else {
			return false;
		}

	}
}
