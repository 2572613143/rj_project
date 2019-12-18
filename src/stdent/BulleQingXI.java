package stdent;

public class BulleQingXI {

	public static void main(String[] args) {
		int[]array= {9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);System.out.println();
		
		
		System.out.print("原数据是"+"  ");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();System.out.println();
		
		
		int temp=0;
		for (int m = 1; m < array.length; m++) {//这是外循环
			System.out.println("这是第"+m+"轮"+"外循环：");System.out.println();
			//上面这句是给个文字解释并换行
			
			for (int j = 0; j < array.length-m; j++) {//这是内循环
				if (array[j]>array[j+1]){
					temp=array[j];			//第一个数赋值给空变量
					array[j]=array[j+1];	//第二个数赋值给第一个数
					array[j+1]=temp;		//有了值的变量赋值给空的第二个数
											//简单来说就是交换了下位置
					}
//				else {
//					array[j]=array[j];
//					array[j+1]=array[j+1];
//					}
			//第二个数大于第一个数的话，就保持原位置不动	
			//这里可以忽略不写，所以我注释掉了，
			
					System.out.print("第"+(j+1)+"轮"+"内循环输出的数据是  ");
					//上面是给内循环的轮数做一个文字性的解释
					
					for (int i=0;i<array.length;i++) {
						System.out.print(array[i]+" ");
					}
					//上面是打印输出内循环的数组元素，下面是换行
					System.out.println();
				
			}
			System.out.println();
			System.out.print("所以第"+m+"轮"+"外循环输出的数据是  ");
			//上面是给外循环一个文字性的解释
			//下面是把这一轮外循环的数组元素打印出来
			for (int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();System.out.println();//换行换行
		}
		//外循环和内循环都做完了
		
		
		System.out.print("最后的结果是  ");//文字提示
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		//循环打印出冒泡结束后的数组元素 也就是 2 3 5 8 9
	}


}
