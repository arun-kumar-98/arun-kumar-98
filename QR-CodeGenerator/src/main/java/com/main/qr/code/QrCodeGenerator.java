package com.main.qr.code;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrCodeGenerator {

	public static void generateQrCodeImage(String text, int width, int height, String path)
			throws WriterException, IOException {

		QRCodeWriter codeWriter = new QRCodeWriter();

		BitMatrix bitMatrix = codeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

		Path path2 = FileSystems.getDefault().getPath(path);

		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path2);
	}

	public static byte[] getQrCode(String text, int width, int height) throws WriterException, IOException {

		QRCodeWriter codeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = codeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

		ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
		MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);

		return pngOutputStream.toByteArray();

	}

}
