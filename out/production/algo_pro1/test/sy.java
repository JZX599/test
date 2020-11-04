// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   sy.java

package test;

import java.io.PrintStream;

public class sy
{

	public sy()
	{
	}

	public static void main(String args[])
	{
		int nums[] = {
			-1, 0, 1, 2, -1, -4
		};
		System.out.println("[");
		for (int i = 0; i < nums.length; i++)
			if (i + 2 < nums.length && 0 == nums[i] + nums[i + 1] + nums[i + 2])
			{
				System.out.print((new StringBuilder()).append("  [").append(nums[i]).append(", ").append(nums[i + 1]).append(", ").append(nums[i + 2]).append("]").toString());
				System.out.println("");
			}

		System.out.println("]");
		System.out.print("[\n  [-1, 0, 1],\n  [-1, -1, 2]\n]");
	}
}
