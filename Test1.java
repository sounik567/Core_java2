1 class Friend
2 {
3 public static void main(String[] args)
4 {
5 College f1 = new College();
6 College f2 = new College();
7 College f3 = new College();
8 College f4 = new College();
9 College f5 = new College();
10 
11 f1.setclgId(2014015639);
12 f1.setclgName("SHARDA UNIVERSITY");
13 f1.setfriendName("AJIT KUMAR");
14 f1.setclgDept("SET");
15 f1.setage(25);
16 
17 f2.setclgId(2015785463);
18 f2.setclgName("Sharda university");
19 f2.setfriendName("Sarita ");
20 f2.setclgDept("MBA");
21 f2.setage(21);
22 
23 f3.setclgId(2014562378);
24 f3.setclgName("Sharda university");
25 f3.setfriendName("AJAY YADAV");
26 f3.setclgDept("SET");
27 f3.setage(26);
28 
29 f4.setclgId(201469876);
30 f4.setclgName("BIT mesra");
31 f4.setfriendName("Rahul kumar");
32 f4.setclgDept("Mechanical");
33 f4.setage(28);
34 
35 f5.setclgId(1401024510);
36 f5.setclgName("NIT");
37 f5.setfriendName("sejal");
38 f5.setclgDept("MBA");
39 f5.setage(23);
40 
41 int f1clgId=f1.getclgId();
42 String f1clgName=f1.getclgName();
43 String f1friendName=f1.getfriendName();
44 String f1clgDept=f1.getclgDept();
45 int f1age=f1.getage();
46 
47 int f2clgId=f2.getclgId();
48 String f2clgName=f2.getclgName();
49 String f2friendName=f2.getfriendName();
50 String f2clgDept=f2.getclgDept();
51 int f2age=f2.getage();
52 
53 int f3clgId=f3.getclgId();
54 String f3clgName=f3.getclgName();
55 String f3friendName=f3.getfriendName();
56 String f3clgDept=f3.getclgDept();
57 int f3age=f3.getage();
58 
59 int f4clgId=f4.getclgId();
60 String f4clgName=f4.getclgName();
61 String f4friendName=f4.getfriendName();
62 String f4clgDept=f4.getclgDept();
63 int f4age=f4.getage();
64 
65 int f5clgId=f5.getclgId();
66 String f5clgName=f5.getclgName();
67 String f5friendName=f5.getfriendName();
68 String f5clgDept=f5.getclgDept();
69 int f5age=f5.getage();
70 
71 
72 System.out.println(f1clgId + " " + f1clgName+" " + f1friendName + " " + f1clgDept
+ " " +f1age);
73 System.out.println(f2clgId + " " + f2clgName+" " + f2friendName + " " + f2clgDept
+ " " +f2age);
74 System.out.println(f3clgId + " " + f3clgName+" " + f3friendName + " " + f3clgDept
+ " " +f3age);
75 System.out.println(f4clgId + " " + f4clgName+" " + f4friendName + " " + f4clgDept
+ " " +f4age);
76 System.out.println(f5clgId + " " + f5clgName+" " + f5friendName + " " + f5clgDept
+ " " +f5age);
77 
78 }
79 }
80 class College
81 {
82 private int clgId;
83 private String clgName;
84 private String friendName;
85 private String clgDept;
86 private int age;
87 
88 public void setclgId(int clgId)
89 {
90 this.clgId=clgId;
91 }
92 public void setclgName(String clgName)
93 {
94 this.clgName=clgName;
95 
96 }
97 public void setfriendName(String friendName)
98 {
99 this.friendName=friendName;
100 }
101 public void setclgDept(String clgDept)
102 {
103 this.clgDept=clgDept;
104 }
105 public void setage(int age)
106 {
107 this.age=age;
108 }
109 public int getclgId()
110 {
111 return clgId;
112 }
113 public String getclgName()
114 {
115 return clgName;
116 }
117 public String getfriendName()
118 {
119 return friendName;
120 }
121 public String getclgDept()
122 {
123 return clgDept;
124 }
125 public int getage()
126 {
127 return age;
128 }
129 }