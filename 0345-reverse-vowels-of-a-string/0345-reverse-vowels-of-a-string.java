class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
         HashSet<Character> h= new HashSet<>();
         h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
         h.add('A');
        h.add('E');
        h.add('I');
        h.add('O');
        h.add('U');
        int l=0;
        int y= s.length()-1;
        while(l<=y)
        {
            while(l<y&&!h.contains(a[l]))l++;
            while(l<y&&!h.contains(a[y]))y--;
            char temp=a[l];
            a[l]=a[y];
            a[y]=temp;
            l++;
            y--;
        }
        return new String(a);
    }
}