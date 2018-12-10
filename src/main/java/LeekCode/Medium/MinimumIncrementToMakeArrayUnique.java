package LeekCode.Medium;

public class MinimumIncrementToMakeArrayUnique {
    public int go2(int[] A) {
        if(A.length == 0) return 0;
        int[] results = new int[40001];
        for(int i: A){
            results[i]++;
        }
        int counter = 0;
        for(int j = 0; j < results.length-1; j++){
            if(results[j] != 0){
                results[j+1] += results[j]-1;
                counter += results[j]-1;
                results[j] = 1;
            }

        }
        int temp = results[40000] -1;
        return counter + (1+temp)*temp /2;
    }

    public int[] allthedupes(int[] nums) {
        int[] table = new int[2^12];
        for (int i=0; i<nums.length; i++) {
            table[i]++;
        }
        int[] result = new int[2^12];
        for (int i=0; i<table.length;i++) {
            result[i] = i;
        }

        return result;
    }

    public int go(int[] A) {
        int[] count = new int[80000];
        for (int a : A) count[a]++;
        int ret = 0, moveReq = 0;
        for (int i = 0, n = A.length; n > 0; i++) {
            if (count[i] > 0 || moveReq > 0) n--;
            if (count[i] > 1) {
                moveReq += count[i] - 1;//add count[i]-1 indices that need increment
                ret -= (count[i] - 1) * i; //if move to j, than ret += j-i, do -i in advance
            } else if (count[i] == 0 && moveReq > 0) {
                moveReq--;
                ret += i;
            }
        }
        return ret;
    }

    public int gary(int[] A) {
        int[] count = new int[80000];
        for (int a : A) count[a]++;
        int result = 0;
        int cumulation = 0;
        int neededSlots = 0;
        for (int i=0; i<count.length; i++) {
            if (count[i]>1) {
                // you have dupes
                cumulation += -1 * ((count[i] - 1) * i);
                neededSlots += count[i] - 1;
            } else if (count[i] == 0 && neededSlots > 0) {
                neededSlots --;
                result +=  (cumulation + i);
            }
        }

        return result;
    }

}
