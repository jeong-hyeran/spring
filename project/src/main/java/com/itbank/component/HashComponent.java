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
		SecureRandom ran = new SecureRandom(); // ë³´ì•ˆ?— ?™œ?š©?•  ?ˆ˜ ?ˆ?Š” ?ˆ˜ì¤??˜ ?œ?¤ 
		byte[] arr = new byte[16];
		ran.nextBytes(arr);
		salt = new String(Base64.getEncoder().encode(arr));
		return salt;
	}

	public String getHash(String source, String salt) {		// ?›ë³? ë¬¸ì?—´
		String hash = null;						// ?•´?‹œê°’ì„ ?‹´?„ ë¬¸ì?—´
		MessageDigest md = null;				// ?•´?‹œ?•Œê³ ë¦¬ì¦˜ì„ ì²˜ë¦¬?•  ê°ì²´
		try {
			md = MessageDigest.getInstance("SHA-512");		//?•´?‹œ ?•Œê³ ë¦¬ì¦? : SHA-512
			
			// ?›ë³? ?†Œ?Š¤ë¥? ì¶”ê??•˜ê¸? ? „, salt?„ ê°™ì´ ì¶”ê??•œ?‹¤.
//			salt = getSalt();
			md.update(salt.getBytes()); 
			/// saltë¥? ëª¨ë¥´ë©? ?›ë³? hashë¥? ?•Œ?ˆ˜ê°? ?—†?–´?„œ saltë¥? ê¼? ???¥?•´?‘¬?•¼?•œ?‹¤.
			
			md.update(source.getBytes());		// ?›ë³? ?†Œ?Š¤ë¥? ë°”ì´?Š¸ ?˜•?ƒœë¡? ì¶”ê?
			hash = String.format("%0128X", new BigInteger(1, md.digest())); 
			////////////////////////////////// int?? longë¡?(primitive) ?‹´ì§? ëª»í•˜?Š” ?‚¬?´ì¦ˆë?? ?´?˜?Š¤(BigInteger)?— ?‹´?Š”?‹¤.
			//////////////////////128?ë¦? ?ˆ˜ë§? ?‚˜?˜¨?‹¤, Xê°? ??ë¬¸ì?—¬?„œ hash?„ ??ë¬¸ìë¡? ?‚˜?˜¨?‹¤.
			// ?›ë³? ?†Œ?Š¤ë¥? SHA512?˜•?‹?„ ? ?š©?•œ ?•´?‹œë¡? ?ˆ«?ë¡? ì¶”ì¶œ?•˜ê³?,
			// ì¶”ì¶œ?œ ?ˆ«?ë¥? 128?ë¦¬ì˜ 16ì§„ìˆ˜ ë¬¸ì?—´ë¡? ë§Œë“¤ê¸?
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hash;
	}
}