package com.workload.dao.impl;

import com.workload.dao.CtypeDao;

public class CtypeDaoimpl implements CtypeDao{

	@Override
	public Double cal(String ctype,int sum) {
		// TODO Auto-generated method stub
		double k1=0,k2=0,k=0;
		if(ctype.equals("理工类基础课"))
		{
			k1=1.0;
			if(sum>=75&&sum<=90)
				k2=1.0;
			else if(sum<75)
			{
				int re=75-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-90;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("理工类专业课"))
		{
			k1=1.2;
			if(sum>=60&&sum<=70)
				k2=1.0;
			else if(sum<60)
			{
				int re=60-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-70;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("社科类"))
		{
			k1=1.0;
			if(sum>=60&&sum<=70)
				k2=1.0;
			else if(sum<60)
			{
				int re=60-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-70;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("思政课"))
		{
			k1=1.0;
			if(sum>=110&&sum<=120)
				k2=1.0;
			else if(sum<110)
			{
				int re=110-sum;
				if(re>75)
					k2=0.7;
				else
					k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-120;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("外语专业课"))
		{
			k1=1.2;
			if(sum>=30&&sum<=40)
				k2=1.0;
			else if(sum<30)
			{
				int re=30-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-40;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("公共外语"))
		{
			k1=1.0;
			if(sum==40)
				k2=1.0;
			else if(sum<40)
			{
				int re=40-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-40;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("外语听力课"))
		{
			k1=0.9;
			if(sum==40)
				k2=1.0;
			else if(sum<40)
			{
				int re=40-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-40;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("体育课"))
		{
			k1=0.9;
			if(sum==40)
				k2=1.0;
			else if(sum<40)
			{
				int re=40-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-40;
				if(re>40)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("公共任选课"))
		{
			k1=1.0;
			if(sum==150)
				k2=1.0;
			else if(sum<150)
			{
				int re=150-sum;
				if(re>75)
					k2=0.7;
				else
					k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-150;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("美术类"))
		{
			k1=1.0;
			if(sum==70)
				k2=1.0;
			else if(sum<70)
			{
				int re=70-sum;
				k2=1.0-re*0.004;
			}
			else
			{
				int re=sum-70;
				if(re>75)
					k2=1.3;
				else
					k2=1.0+re*0.004;
			}
		}
		if(ctype.equals("实验课"))
		{
			k1=0.65;
			if(sum==30)
				k2=1.0;
			else if(sum<30)
			{
				int re=30-sum;
				if(re>15)
					k2=0.7;
				else
					k2=1.0-re*0.02;
			}
			else
			{
				int re=sum-30;
				if(re>15)
					k2=1.3;
				else
					k2=1.0+re*0.02;
			}
		}
		if(ctype.equals("计算机上机"))
		{
			k1=0.5;
			if(sum==50)
				k2=1.0;
			else if(sum<50)
			{
				int re=50-sum;
				if(re>15)
					k2=0.7;
				else
					k2=1.0-re*0.02;
			}
			else
			{
				int re=sum-50;
				if(re>15)
					k2=1.3;
				else
					k2=1.0+re*0.02;
			}
		}
		if(ctype.equals("艺术类"))
		{
			k1=0.7;
			k2=1.0;
		}
		if(ctype.equals("建筑类"))
		{
			k1=0.7;
			k2=1.0;
		}
		k=k1*k2;
		return k;
	}

}
