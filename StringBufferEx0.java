public class StringBufferEx0 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("123");
        StringBuffer sb2 = sb.append("ZZ");
        System.out.println(sb);
        System.out.println(sb2);
        //sb와 sb2가 같은 StringBuffer인스턴스를 가리키고 있으므로 같은 내용이 출력된다.
    }
}
