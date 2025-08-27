class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] Morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> unique=new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i<word.length();i++) {
                char c=word.charAt(i);
                int index=c - 'a';
                sb.append(Morse[index]);
            }
            unique.add(sb.toString());
        }

        return unique.size();
    }
}