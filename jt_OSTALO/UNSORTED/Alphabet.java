class Alphabet {
    public static void main(String[] args) {
        char ch ='a';
        while (ch <= 'z') {
            if (ch != 'z')
                System.out.print(ch + ", ");
            else
                System.out.print(ch);
            ch++;
        }
    }
}