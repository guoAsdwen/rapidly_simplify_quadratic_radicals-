

public class quickly_simplify {
    public static String quickly_simplify(long original) {
    int d = 0;
    double original_sqrt = Math.sqrt(original);
    double max_root = Math.sqrt(original>>1);
    int original_sqrt_int = (int) original_sqrt;
    int out = 1;
    int odd_max_root = (int)max_root>>1;
    odd_max_root = (odd_max_root<<1)+1;
    long remain = original;
    if((original_sqrt-original_sqrt_int)==0) {
	    return(String.valueOf(original_sqrt_int));
    }else {
    for (d = 2;d <= 2;d=d+2) {
		if (remain%(d*d)== 0) {
			remain = remain/(d*d);
			odd_max_root = (int)Math.sqrt(remain>>1);
			out = out*d;
			d = 0;
		}
	}
	for (d = 3;d <= odd_max_root;d=d+2) {
		if (remain%(d*d)== 0) {
			remain = remain/(d*d);
			odd_max_root = (int)Math.sqrt(remain>>1);
			out = out*d;
			d = 1;
		}
	}
		 }
    return(out+"sqrt"+remain);
        }
}