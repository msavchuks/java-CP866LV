package lv.cp866.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;


public class CP866LVCharset extends Charset {

	protected CP866LVCharset(String canonicalName, String[] aliases) {
		super(canonicalName, aliases);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean contains(Charset cs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CharsetDecoder newDecoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharsetEncoder newEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

}
