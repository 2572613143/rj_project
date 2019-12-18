package rj_1802;

public class Danxunhuan {

	public static void main(String[] args) {
		//TODO 自动生成根的方法
		String[] qiudui={"管理学院","设计学院","音乐学院","演绎学院","教育学院","中专部","饮食文化学院","轮空"};
				/*
				 * 下标 0 1 2 3 4 5 
				 * 第一轮比赛
				 * 0VS5 1VS4 2VS3
				 * 
				 * 下标 0 5 1 2 3 4  
				 * 第二轮比赛
				 * 0VS4 5VS3 1VS2
				 * 
				 * 下标 0 4 5 1 2 3  
				 * 第三轮比赛
				 * 0VS3 4VS2 5VS1
				 * 
				 * 下标 0 3 4 5 1 2      
				 * 第四轮比赛
				 * 0VS2 3VS1 4VS5
				 * 
				 * 下标 0 2 3 4 5 1   
				 * 第五轮比赛
				 * 0VS1 2VS5 3VS4
				 */
		for (int i = 1; i < qiudui.length; i++) {
			if (i>1) {
				
				String stemp=qiudui[qiudui.length-1];
				
				for (int k=qiudui.length-1; k > 1; k--) 
					qiudui[k]=qiudui[k-1];
					qiudui[1]=stemp;
				
			}
			System.out.println("第"+i+"轮");
			for (int j = 0; j < qiudui.length/2; j++) {
				System.out.println(qiudui[j]+"VS"+qiudui[qiudui.length-j-1]);
				
			}
		}
	}

}
