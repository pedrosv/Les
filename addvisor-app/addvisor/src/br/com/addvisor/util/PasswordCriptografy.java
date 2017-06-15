package br.com.addvisor.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordCriptografy {

	public PasswordCriptografy() {
		super();
	}

	public String execute(String password) {
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance(Constants.CRYPTO_ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		digest.update(password.getBytes());
		return new BigInteger(1, digest.digest()).toString(16);
	}
}
