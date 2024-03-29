package com.harsh.programming;

public class BasicCrypto implements Crypto {

	public byte[] encrypt(byte[] data) {
		byte[] enc = new byte[data.length];

		for (int i = 0; i < data.length; i++)
			enc[i] = (byte) ((i % 2 == 0) ? data[i] + 1 : data[i] - 1);

		return enc;
	}

	public byte[] decrypt(byte[] data) {
		byte[] dec = new byte[data.length];

		for (int i = 0; i < data.length; i++)
			dec[i] = (byte) ((i % 2 == 0) ? data[i] - 1 : data[i] + 1);

		return dec;
	}
}
