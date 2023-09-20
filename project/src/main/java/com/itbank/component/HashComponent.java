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
		SecureRandom ran = new SecureRandom(); // 보안?�� ?��?��?�� ?�� ?��?�� ?���??�� ?��?�� 
		byte[] arr = new byte[16];
		ran.nextBytes(arr);
		salt = new String(Base64.getEncoder().encode(arr));
		return salt;
	}

	public String getHash(String source, String salt) {		// ?���? 문자?��
		String hash = null;						// ?��?��값을 ?��?�� 문자?��
		MessageDigest md = null;				// ?��?��?��고리즘을 처리?�� 객체
		try {
			md = MessageDigest.getInstance("SHA-512");		//?��?�� ?��고리�? : SHA-512
			
			// ?���? ?��?���? 추�??���? ?��, salt?�� 같이 추�??��?��.
//			salt = getSalt();
			md.update(salt.getBytes()); 
			/// salt�? 모르�? ?���? hash�? ?��?���? ?��?��?�� salt�? �? ???��?��?��?��?��?��.
			
			md.update(source.getBytes());		// ?���? ?��?���? 바이?�� ?��?���? 추�?
			hash = String.format("%0128X", new BigInteger(1, md.digest())); 
			////////////////////////////////// int?? long�?(primitive) ?���? 못하?�� ?��?��즈�?? ?��?��?��(BigInteger)?�� ?��?��?��.
			//////////////////////128?���? ?���? ?��?��?��, X�? ??문자?��?�� hash?�� ??문자�? ?��?��?��.
			// ?���? ?��?���? SHA512?��?��?�� ?��?��?�� ?��?���? ?��?���? 추출?���?,
			// 추출?�� ?��?���? 128?��리의 16진수 문자?���? 만들�?
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hash;
	}
}