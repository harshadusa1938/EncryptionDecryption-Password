package com.harsh.programming;

public class CryptoApp {

	public static void main(String[] args) {

		Crypto crypto = new BasicCrypto();

		String data = "HarshadPatel";

		String enc = new String(crypto.encrypt(data.getBytes()));
		String dec = new String(crypto.decrypt(enc.getBytes()));

		System.out.println("Orignial Password: " + data);
		System.out.println("Encryption Password: " + enc);
		System.out.println("Encryption Password: " + dec);

	}
}
