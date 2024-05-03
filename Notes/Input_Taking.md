# Input Take 
- There are two ways to take input from user
        1) Using BufferReader
        2) Using Scanner 

        # Taking Input Using Buffer reader

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();



        # Taking Input  with Scanner
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();=
        System.out.println(num1);