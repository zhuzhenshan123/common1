package com.shan.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: �����������
 * @author: ����ɽ
 * @date: 2020��2��27�� ����9:41:29
 */
public class RandomUtil {
	
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
		public static int random(int min, int max){
		//TODO ʵ�ִ���
			Random r = new Random();
			int i =r.nextInt(max-min+1)+min;
			return i;
		}
		//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
		public static int[] subRandom (int min, int max, int subs){
		//TODO ʵ�ִ���
			int[] x = new int[subs];
			HashSet<Integer> set = new HashSet<Integer>();
			while(set.size()!=subs) {
				int i = random(min, max);
				set.add(i);
			}
			int k=0;
			for (Integer value : set) {
				x[k]=value;
				k++;
			}
			
			return x;
		}
		//����3������1��1-9,a-Z֮�������ַ��� (8��)
		public static char randomCharacter (){
		//TODO ʵ�ִ���
			String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
			char c = str.charAt(random(0, str.length()-1));
			return c;
		}
		//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
		public static String randomString(int length){
		//TODO ʵ�ִ���
			String str="";
			for (int i = 0; i <length; i++) {
				str+=randomCharacter();
			}
			return str;
		}

		
	
}
