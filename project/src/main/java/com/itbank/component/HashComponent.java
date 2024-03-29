package com.itbank.component;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public class HashComponent {
	
	public String getRandomSalt() {
		String salt = null;
		SecureRandom ran = new SecureRandom(); // λ³΄μ? ??©?  ? ?? ?μ€?? ??€ 
		byte[] arr = new byte[16];
		ran.nextBytes(arr);
		salt = new String(Base64.getEncoder().encode(arr));
		return salt;
	}

	public String getHash(String source, String salt) {		// ?λ³? λ¬Έμ?΄
		String hash = null;						// ?΄?κ°μ ?΄? λ¬Έμ?΄
		MessageDigest md = null;				// ?΄??κ³ λ¦¬μ¦μ μ²λ¦¬?  κ°μ²΄
		try {
			md = MessageDigest.getInstance("SHA-512");		//?΄? ?κ³ λ¦¬μ¦? : SHA-512
			
			// ?λ³? ??€λ₯? μΆκ??κΈ? ? , salt? κ°μ΄ μΆκ???€.
//			salt = getSalt();
			md.update(salt.getBytes()); 
			/// saltλ₯? λͺ¨λ₯΄λ©? ?λ³? hashλ₯? ??κ°? ??΄? saltλ₯? κΌ? ???₯?΄?¬?Ό??€.
			
			md.update(source.getBytes());		// ?λ³? ??€λ₯? λ°μ΄?Έ ??λ‘? μΆκ?
			hash = String.format("%0128X", new BigInteger(1, md.digest())); 
			////////////////////////////////// int?? longλ‘?(primitive) ?΄μ§? λͺ»ν? ?¬?΄μ¦λ?? ?΄??€(BigInteger)? ?΄??€.
			//////////////////////128?λ¦? ?λ§? ??¨?€, Xκ°? ??λ¬Έμ?¬? hash? ??λ¬Έμλ‘? ??¨?€.
			// ?λ³? ??€λ₯? SHA512??? ? ?©? ?΄?λ‘? ?«?λ‘? μΆμΆ?κ³?,
			// μΆμΆ? ?«?λ₯? 128?λ¦¬μ 16μ§μ λ¬Έμ?΄λ‘? λ§λ€κΈ?
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hash;
	}
}