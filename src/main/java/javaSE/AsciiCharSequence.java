package javaSE;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{
    private byte [] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char)array.length;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange (array.clone(), start, end));
    }

    public String toString() {
        return new String();
    }
}
