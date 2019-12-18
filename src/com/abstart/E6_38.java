package com.abstart;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class E6_38 {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("张三","李四","张小明","张阳");
		Stream<String> parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		Stream<String> stream=Stream.of("张三","李四","张小明","张阳");
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());
	}

}
