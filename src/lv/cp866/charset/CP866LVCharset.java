package lv.cp866.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;


public class CP866LVCharset extends Charset {
	
	private final char[] BYTE_TO_CHAR = { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
			'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г',
			'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', '░', '▒', '▓', '│', '┤', 'Ā', '╢', 'ņ', '╕',
			'╣', '║', '╗', '╝', '╜', '╛', '┐', '└', '┴', '┬', '├', '─', '┼', 'ā', '╟', '╚', '╔', '╩', '╦', '╠', '═',
			'╬', '╧', 'Š', '╤', 'č', 'Č', '╘', '╒', 'ģ', 'Ī', 'ī', '┘', '┌', '█', '▄', 'ū', 'Ū', '▀', 'р', 'с', 'т',
			'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'Ē', 'ē', 'Ģ', 'ķ', 'Ķ', 'ļ', 'Ļ', 'ž',
			'Ž', '∙', '·', '√', 'Ņ', 'š', '■', ' ' };
	
	private final int OFFSET = 128;

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
		return new CharsetDecoder(this, 1, 1) {
			@Override
			protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
				while (in.remaining() > 0 && out.remaining() > 0) {
					byte b = in.get();
					char c = ' ';
					if (b < 0) {
						c = BYTE_TO_CHAR[b + OFFSET];
					} else {
						c = (char) b;
					}
					out.append(c);
				}
				if (in.remaining() == 0)
					return CoderResult.UNDERFLOW;
				else
					return CoderResult.OVERFLOW;
			}
		};
	}
	}

	@Override
	public CharsetEncoder newEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

}
