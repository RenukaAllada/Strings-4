class Sample{
    /***************PROBLEM-1*************/
    /***************PROBLEM-2*************/
//TC:0(N)
        //SC:0(1)
    class Solution {
        public int myAtoi(String s) {
            s=s.trim();
            if(s.length()==0 || s==null){
                return 0;
            }

            char sign='+';

            if(s.charAt(0)=='-'){
                sign='-';
            }

            if(s.charAt(0)!='-' && s.charAt(0)!='+' && !Character.isDigit(s.charAt(0))){

                return 0;
            }

            int num=0;
            int limit=Integer.MAX_VALUE/10;

            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isDigit(c)){
                    if(sign=='+'){
                        if((num> limit) || (num==limit && c>='7')){
                            return Integer.MAX_VALUE;
                        }
                    }else{
                        if((num> limit) || (num==limit && c>='8')){
                            return Integer.MIN_VALUE;
                        }
                    }
                    num=num*10+(c-'0');
                }
                else if(i!=0){
                    break;
                }
            }
            if(sign=='-'){
                return -1*num;
            }else{
                return num;
            }

        }
    }
    /***************PROBLEM-3*************/
}