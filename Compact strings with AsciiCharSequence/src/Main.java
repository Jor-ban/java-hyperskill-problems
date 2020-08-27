import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] arr;

    AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }

    @Override
    public int length() {
        return arr.length;
    }
    @Override
    public char charAt(int i) {
        return i < arr.length && i >= 0 ? (char) arr[i] : '\000';
    }
    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] newArr = new byte[i1 - i];
        for (; i < i1; i++) {
            newArr[i + newArr.length - i1] = arr[i];
        }
        return new AsciiCharSequence(newArr);
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}