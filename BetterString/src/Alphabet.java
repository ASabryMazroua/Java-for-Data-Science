class Alphabet{

    public static void main(String[] args)
    {
        System.out.println(isStringOnlyAlphabet("GeeksforGeeks"));
        System.out.println(isStringOnlyAlphabet("Geeks4Geeks"));
    }

    public static boolean isStringOnlyAlphabet(String s)
    {
        return s.chars().allMatch(Character::isLetter);
    }
}
