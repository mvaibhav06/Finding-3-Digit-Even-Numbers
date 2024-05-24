class EvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> temp = new HashSet<>();

        for(int i=0; i<digits.length; i++){
            int a = digits[i];
            if(a==0){
                continue;
            }
            for(int j=0; j<digits.length; j++){
                if (i==j){
                    continue;
                }
                int b = (a*10) + digits[j];
                for(int k=0; k<digits.length; k++){
                    if (j==k || k==i){
                        continue;
                    }
                    int c = (b*10) + digits[k];
                    if(c%2==0){
                        temp.add(c);
                    }
                }
            }
        }
        int[] out = new int[temp.size()];
        int p = 0;
        for(int s : temp){
            out[p++] = s;
        }
        Arrays.sort(out);
        return out;
    }
}
