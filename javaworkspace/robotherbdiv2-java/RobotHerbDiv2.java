public class RobotHerbDiv2 {

	public int getdist(int T, int[] a) {
		long[] loc=new long[2];
		loc[0]=0;
		loc[1]=0;
		int d=0;
		int[] dx=new int[]{1,0,-1,0};
		int[] dy=new int[]{0,-1,0,1};
		for(int it=0;it<T;it++){
			for(int i=0;i<a.length;i++){
				loc[0]+=dx[d]*a[i];
				loc[1]+=dy[d]*a[i];
				d+=a[i];
				d=d%4;
			}
		}
		return (int)(Math.abs(loc[0])+Math.abs(loc[1]));
	}

}
