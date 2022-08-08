package com.main.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.WriterException;
import com.main.qr.code.QrCodeGenerator;

@RestController
public class QRCodeGeneratorController {

	private static final String QR_CODE_PATH = "./src/main/resources/qrcode.png";

	@GetMapping("/download-qr/{codeText}/{width}/{height}")
	public void download(@PathVariable String codeText, @PathVariable int width, @PathVariable int height)
			throws WriterException, IOException {

		QrCodeGenerator.generateQrCodeImage(codeText, width, height, QR_CODE_PATH);

	}

	@GetMapping("/generate/{codeText}/{width}/{height}")
	public ResponseEntity<byte[]> getGeneratedQrCode(@PathVariable String codeText, @PathVariable int width,
			@PathVariable int height) throws WriterException, IOException {

		return ResponseEntity.status(HttpStatus.OK).body(QrCodeGenerator.getQrCode(codeText, width, height));

	}

}
