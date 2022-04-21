/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamapp;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ztjam
 */
public class MAMGUI extends javax.swing.JFrame {

         private ArrayList <MAM> calender;
         private ArrayList <MAM> health;
    public static int i;
    
         
    /**
     * Creates new form MAMGUI
     */
    public MAMGUI() {
        initComponents();
        calender = new ArrayList<>();
        health = new ArrayList<>();
        
             HealthAdvivce h = new HealthAdvivce();
            h.setAdvice("Eat a healthy breakfast. Eating breakfast starts your day off on the right foot and gives you fuel for the day that will help you make better food decisions throughout the day.  ");
        health.add(h);
        HealthAdvivce h1 = new HealthAdvivce();
            h1.setAdvice("Get moving. Walk where you can, whenever you can. Walk to a co-worker’s desk instead of sending an email. Take a lap around the block or a nearby park in your free time at home. You don’t have to take long or intense walks but try to add a few more steps to your day.  ");
        health.add(h1);
                     HealthAdvivce h2 = new HealthAdvivce();
            h2.setAdvice("Find a workout buddy. It may not be for everyone, but for a lot of people, having a buddy to meet for workouts helps with accountability and enjoyability. If your friends’ workout schedules don’t work with yours, check out our small group training and group exercise options.  ");
        health.add(h2);
             HealthAdvivce h3 = new HealthAdvivce();
            h3.setAdvice("Make it easier to get a full night’s sleep. Blocking out unwanted noise, keeping your room cooler and making sure your bedroom is dark enough are all ways to help perfect your sleeping environment.");
        health.add(h3);
             HealthAdvivce h4 = new HealthAdvivce();
            h4.setAdvice("Spend time with positive people. When getting started with a new habit or lifestyle change, it’s important to surround yourself with people who support you and can give you encouragement. Make plans with your support system this week to absorb some positivity. ");
        health.add(h4);
             HealthAdvivce h5 = new HealthAdvivce();
            h5.setAdvice("Make food changes slowly. Don’t try to change everything at once! Instead of making drastic changes all at once, make a few small adjustments every week or month to help you get where you want to be. Try a new food or modify the proportions you eat, and let your body acclimate between changes.");
        health.add(h5);
             HealthAdvivce h6 = new HealthAdvivce();
            h6.setAdvice("Try have eight cups of water a day. The amount of water each person needs can vary, but eight cups a day is a good rule of thumb (possibly more depending on your activity level).");
        health.add(h6);
             HealthAdvivce h7 = new HealthAdvivce();
            h7.setAdvice(" Exchange the elevator for the stairs. There’s a reason we have stair climbers at the J – getting those steps in is great exercise. Adding more flights of stairs into your routine can increase your conditioning as well! ");
        health.add(h7);
             HealthAdvivce h8 = new HealthAdvivce();
            h8.setAdvice("Meal prep & cook ahead. Resorting to fast food or vending machine snacks is often the result of not having a better option easily available. Planning for the week can help you schedule in time to prepare your food while juggling all of your weekly responsibilities. Try to set aside a few hours to make a few meals all at once, and you can start your week off with all your meals ready to go! ");
        health.add(h8);
             HealthAdvivce h9 = new HealthAdvivce();
            h9.setAdvice(" Fit in a short workout before your shower. Give yourself a few extra minutes before you shower to fit in some bodyweight exercises. Or do them before you make your bed in the morning or after doing your dinner dishes. Pick a regular moment during your daily routine and commit to a few exercises. Squats, lunges, push-ups, sit-ups, and planks are all easy to fit in – no matter the room of your house!");
        health.add(h9);
             HealthAdvivce h10 = new HealthAdvivce();
            h10.setAdvice("Go to bed at the same time every night. Or at least as much as possible. Everyone’s schedule changes but training your body to begin the sleep process at a similar time each evening can help you fall asleep more quickly and prevent those nights of restless tossing and turning. ");
        health.add(h10);
             HealthAdvivce h11 = new HealthAdvivce();
            h11.setAdvice("Go shopping on a full stomach. Avoid that moment in the grocery store when you watch your favourite unhealthy food make its way into your cart. When you’re hungry, you’re more likely to buy more food than you need and to let those unhealthy foods you crave make their way back to your home.  ");
        health.add(h11);
             HealthAdvivce h12 = new HealthAdvivce();
            h12.setAdvice("Stop doing anything in your bed except for sleep and sex. Make your night’s sleep better by conditioning your body. Scale back your use of devices and TV before you’re in bed.   ");
        health.add(h12);
             HealthAdvivce h13 = new HealthAdvivce();
            h13.setAdvice("Dine out less frequently. Save money and calories. By making your meals at home, you can monitor what actually goes into your food and the portion size. ");
        health.add(h13);
             HealthAdvivce h14 = new HealthAdvivce();
            h14.setAdvice("Make sure you are using proper form.  The lack of proper forms makes you more likely to get injured, less likely to get stronger. Before starting a new exercise, double check the proper form. ");
        health.add(h14);
             HealthAdvivce h15 = new HealthAdvivce();
            h15.setAdvice("Get organized and set priorities and deadlines. Stress makes sticking to your fitness and diet plan even harder, and a lack of organization can add to your stress. So, outline some projects (home, monetary, work, etc.) that can help you organize pieces of your daily life and help you reduce stress. ");
        health.add(h15);
             HealthAdvivce h16 = new HealthAdvivce();
            h16.setAdvice("If you smoke, try to quit. Quitting smoking can not only help you increase your fitness level but also your day-to-day health as well. ");
        health.add(h16);
             HealthAdvivce h17 = new HealthAdvivce();
            h17.setAdvice("Do your grocery shopping with a list in hand. Making a list before getting to the grocery store can help you say no to impulse buys and snacks. ");
        health.add(h17);
             HealthAdvivce h18 = new HealthAdvivce();
            h18.setAdvice("Exercise during TV commercials. When a commercial starts, make the most of that downtime. Walk around your house or hold a plank as long as possible. Have a Netflix-only household? Set a timer on your phone to remind you to get up every ten minutes to fit in a short exercise.  ");
        health.add(h18);
             HealthAdvivce h19 = new HealthAdvivce();
            h19.setAdvice("Take Naps. A 30-minute nap or even an extended rest period of laying down have been found to improve alertness and performance.  ");
        health.add(h19);
             HealthAdvivce h20 = new HealthAdvivce();
            h20.setAdvice(" Have a balanced diet. There are a lot of different diets out there, but the easiest thing you can do is to just have a balanced diet. ");
        health.add(h20);
             HealthAdvivce h21 = new HealthAdvivce();
            h21.setAdvice("Take a walk. Walking is a calming activity that helps you stay healthy without requiring any equipment.  ");
        health.add(h21);
             HealthAdvivce h22 = new HealthAdvivce();
            h22.setAdvice("Brush your teeth and floss. It is recommended to brush at least twice a day. Periodontitis, or inflammation of the gums, is considered a significant risk factor for cardiovascular disease. ");
        health.add(h22);
           HealthAdvivce h23 = new HealthAdvivce();
            h23.setAdvice("Eat more spicy foods. Hot peppers contain capsaicin. Capsaicin has a number of health benefits. (Be safe with the level of spice you use.) ");
        health.add(h23);
        HealthAdvivce h24 = new HealthAdvivce();
            h24.setAdvice("Shop the perimeter. Healthier foods like fruits, vegetables and meats aren’t generally found in the aisles of the grocery store. Try to fill your cart with items found around the perimeter of the store and avoid the aisles as much as possible. ");
        health.add(h24);
        HealthAdvivce h25 = new HealthAdvivce();
            h25.setAdvice("Put on your gym clothes. Just committing to putting on your workout clothes can be enough to convince yourself to head to the gym. ");
        health.add(h25);
        HealthAdvivce h26 = new HealthAdvivce();
            h26.setAdvice("Watch less TV. It’s tough to admit, but TV watching is a sedentary activity. Can you challenge yourself to replace some of your TV watching with a more active hobby?  ");
        health.add(h26);
        HealthAdvivce h27 = new HealthAdvivce();
            h27.setAdvice("Meditate. Try to meditate for at least five minutes a day. Close your eyes and bring your attention to one thing (like your breath) for a period of time. When your mind starts to wander, just let that go and return to your breath. ");
        health.add(h27);
        HealthAdvivce h28 = new HealthAdvivce();
            h28.setAdvice("Skip the cream and sugar in your tea or coffee. And artificial sweeteners, too. Drinking your beverages straight is healthier for you and allows you to maximize their benefits. ");
        health.add(h28);
        HealthAdvivce h29 = new HealthAdvivce();
            h29.setAdvice("Take a hike. No shortage of benefits here: the varied terrain makes this work out a little more intense than just walking, you get to absorb vitamin D from the sun, and hiking is generally a longer workout than a short walk around the neighbourhood. ");
        health.add(h29);
        HealthAdvivce h30 = new HealthAdvivce();
            h30.setAdvice("Journal. Write about your negative thoughts instead of holding them in. Writing down negative experiences, thoughts and problems helps you process, problem-solve and cope. The simple act of writing things down can make a huge difference. ");
        health.add(h30);
        HealthAdvivce h31 = new HealthAdvivce();
            h31.setAdvice("Have more vegetables. Try to add a serving of vegetables to every meal. Vegetables are among the most nutrient-dense of all foods. This food group is a great source of antioxidants, vitamins, and minerals, so add a variety to your diet! ");
        health.add(h31);
        HealthAdvivce h32 = new HealthAdvivce();
            h32.setAdvice("Play. Get involved in sports or games that keep you active and that you enjoy. ");
        health.add(h32);
        HealthAdvivce h33 = new HealthAdvivce();
            h33.setAdvice(" Improve your posture. Whether for health reasons or just to look more confident, you should be paying attention to your posture. Poor posture can lead to neck and back pain and a list of other health complications.");
        health.add(h33);
        HealthAdvivce h34 = new HealthAdvivce();
            h34.setAdvice(" Eat more omega-3 fatty acids. Omega-3 fatty acids have long been praised for their many possible health benefits, including reducing inflammation, lowering your risk of diseases such as heart disease and arthritis, and their positive impact on brain health.");
        health.add(h34);
        HealthAdvivce h35 = new HealthAdvivce();
            h35.setAdvice("Monitor your caffeine intake. Everyone responds to different levels of caffeine, but we think it’s a good rule to avoid consuming caffeine after dinner. Moderating your caffeine intake can help you get better sleep and feel more alert during the day. ");
        health.add(h35);
        HealthAdvivce h36 = new HealthAdvivce();
            h36.setAdvice("Reduce the clutter in your life. All the “stuff” you have in your life can add stress, and you may not even realize it until it’s gone. Try cleaning out that junk drawer, going through those piles of mail or cleaning your closet. Those small improvements could remove small sources of stress and give you a little more peace. ");
        health.add(h36);
        HealthAdvivce h37 = new HealthAdvivce();
            h37.setAdvice("Hang out with friends. Having a supportive social network is important. The strength of your relationships with family, friends and your community support your well-being and physical health. ");
        health.add(h37);
        HealthAdvivce h38 = new HealthAdvivce();
            h38.setAdvice("Start to make your workouts harder. Your workouts are there to improve your fitness, however, if you keep doing the same things over and over, you’ll hit a point where you max out the benefits of that workout. ");
        health.add(h38);
        HealthAdvivce h39 = new HealthAdvivce();
            h9.setAdvice("Do your housework. As simple as it sounds, chores can add up to a significant calorie burn. Tasks like sweeping, yard work or cleaning out a closet are all great ways to get a little extra exercise. ");
        health.add(h39);
        HealthAdvivce h40 = new HealthAdvivce();
            h40.setAdvice("Try to wake up at the same time every day. Getting your body into a rhythm of getting up and out of bed at the same time every day (weekdays and weekends) is one of the best things you can do to ensure you get a good night’s sleep. Even if you’re staying up to different hours each night, committing to your wake time helps regulate your sleep schedule and helps your body get up and going in the morning. ");
        health.add(h40);
        HealthAdvivce h41 = new HealthAdvivce();
            h41.setAdvice("Don’t eat heavy meals before bed. Making your body try to digest a heavy meal makes it harder to relax and harder to sleep. ");
        health.add(h41);
        HealthAdvivce h42 = new HealthAdvivce();
            h42.setAdvice("Push through discomfort. That doesn’t mean push through pain. The number one rule of working out is to listen to your body, but don’t avoid a workout just because it makes you uncomfortable. ");
        health.add(h42);
        HealthAdvivce h43 = new HealthAdvivce();
            h43.setAdvice("Replace unhealthy snacks. Try nuts, fruits, and vegetables. If you live your life on the go try creating pre-packaged bags of snacks over the weekend that you can just grab on the way out the door. ");
        health.add(h43);
        HealthAdvivce h44 = new HealthAdvivce();
            h44.setAdvice("Add recovery workouts. Rest is important to your workout routine, but it is recommend adding active recovery workouts into your schedule. During these workouts, try to keep your heart rate lower by taking a walk or lightly riding a bike. ");
        health.add(h44);
        HealthAdvivce h45 = new HealthAdvivce();
            h45.setAdvice("Work toward your personal goals. Set personal goals that are in alignment with your values and purpose, and then pursue them. Having a specific goal in mind can help frame all the effort you are putting in every day. ");
        health.add(h45);
        HealthAdvivce h46 = new HealthAdvivce();
            h46.setAdvice("Avoid bright light before bed.  Light affects how your body prepares for sleep, so keeping your screens on before bed can interrupt your sleep cycle. ");
        health.add(h46);
        HealthAdvivce h47 = new HealthAdvivce();
            h47.setAdvice("Cut out soft drinks. Soft drinks contain a lot of calories that can easily be removed from your daily intake just by eliminating soft drink consumption. ");
        health.add(h47);
        HealthAdvivce h48 = new HealthAdvivce();
            h48.setAdvice("Prepare for the next day before bed. Set aside a few minutes before getting into bed to write your to-do list for the next day, set your clothes aside, pack your gym bag, etc. Eliminate anything you can that may keep your mind going to help yourself have a better night sleep. ");
        health.add(h48);
        HealthAdvivce h49 = new HealthAdvivce();
            h49.setAdvice("Take a 30-minute walk. This simple habit is a great way to improve your health. ");
        health.add(h49);
        HealthAdvivce h50 = new HealthAdvivce();
            h50.setAdvice("Exercise your mind. Learning is necessary for a balanced lifestyle. Playing games, reading, puzzles, etc. are all great ways to exercise your mind and de-stress.  ");
        health.add(h50);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
        
        
        try {
                 Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("dd");  
                String strDate = dateFormat.format(date); 
            
                 int n = Integer.parseInt(strDate);
                 
                  String line = Files.readAllLines(Paths.get("MAMcalender.txt")).get(n);
                 
                 
                  CalenderMainLBL.setText ( line );
                 
             } catch (IOException ex) {
                 Logger.getLogger(MAMGUI.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        


        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WaterGRP = new javax.swing.ButtonGroup();
        ReminderGRP = new javax.swing.ButtonGroup();
        StretchGRP = new javax.swing.ButtonGroup();
        BreakGRP = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        HomePNL = new javax.swing.JPanel();
        WaterRemainingLBL = new javax.swing.JLabel();
        BreakRemaining = new javax.swing.JLabel();
        BreakRemainingLBL = new javax.swing.JLabel();
        StretchRemaining = new javax.swing.JLabel();
        HomeTimerLBL = new javax.swing.JLabel();
        RemainingtimeStretchLBL = new javax.swing.JLabel();
        WaterRemaining = new javax.swing.JLabel();
        HealthBTN = new javax.swing.JButton();
        DateBTN = new javax.swing.JButton();
        CalenderHomeLBL = new javax.swing.JLabel();
        CalenderMainLBL = new javax.swing.JLabel();
        ReminderBCKRND2 = new javax.swing.JLabel();
        RemindersPNL = new javax.swing.JPanel();
        TitleLBL = new javax.swing.JLabel();
        InfoLBL = new javax.swing.JLabel();
        WaterLBL = new javax.swing.JLabel();
        WaterTF = new javax.swing.JTextField();
        StretchTF = new javax.swing.JTextField();
        StretchLBL = new javax.swing.JLabel();
        BreakLBL = new javax.swing.JLabel();
        BreakTF = new javax.swing.JTextField();
        ConfirmBTN = new javax.swing.JButton();
        ReminderBCKRND = new javax.swing.JLabel();
        CalenderPNL = new javax.swing.JPanel();
        Day1TF = new javax.swing.JTextField();
        Day8TF = new javax.swing.JTextField();
        Day15TF = new javax.swing.JTextField();
        Day22TF = new javax.swing.JTextField();
        Day2TF = new javax.swing.JTextField();
        Day9TF = new javax.swing.JTextField();
        Day16TF = new javax.swing.JTextField();
        Day23TF = new javax.swing.JTextField();
        Day3TF = new javax.swing.JTextField();
        Day10TF = new javax.swing.JTextField();
        Day17TF = new javax.swing.JTextField();
        Day24TF = new javax.swing.JTextField();
        Day4TF = new javax.swing.JTextField();
        Day11TF = new javax.swing.JTextField();
        Day18TF = new javax.swing.JTextField();
        Day25TF = new javax.swing.JTextField();
        Day5TF = new javax.swing.JTextField();
        Day12TF = new javax.swing.JTextField();
        Day19TF = new javax.swing.JTextField();
        Day26TF = new javax.swing.JTextField();
        Day6TF = new javax.swing.JTextField();
        Day13TF = new javax.swing.JTextField();
        Day20TF = new javax.swing.JTextField();
        Day27TF = new javax.swing.JTextField();
        Day7TF = new javax.swing.JTextField();
        Day14TF = new javax.swing.JTextField();
        Day21TF = new javax.swing.JTextField();
        Day28TF = new javax.swing.JTextField();
        SaveBTN = new javax.swing.JButton();
        Week1LBL = new javax.swing.JLabel();
        Week2LBL = new javax.swing.JLabel();
        Week3LBL = new javax.swing.JLabel();
        Week4LBL = new javax.swing.JLabel();
        ReadBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        ReminderBCKRND1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HomePNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WaterRemainingLBL.setText("Remaining time (water):");
        HomePNL.add(WaterRemainingLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 283, -1, -1));

        BreakRemaining.setText("No current timer");
        HomePNL.add(BreakRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 202, -1));

        BreakRemainingLBL.setText("Remaining time (Break):");
        HomePNL.add(BreakRemainingLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        StretchRemaining.setText("No current timer");
        HomePNL.add(StretchRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 202, -1));

        HomeTimerLBL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        HomeTimerLBL.setText("Timer");
        HomePNL.add(HomeTimerLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 241, -1, -1));

        RemainingtimeStretchLBL.setText("Remaining time (Stretch):");
        HomePNL.add(RemainingtimeStretchLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        WaterRemaining.setText("No current timer");
        HomePNL.add(WaterRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 202, -1));

        HealthBTN.setText("Helth");
        HealthBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthBTNActionPerformed(evt);
            }
        });
        HomePNL.add(HealthBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 298, 73, -1));

        DateBTN.setText("Refresh");
        DateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateBTNActionPerformed(evt);
            }
        });
        HomePNL.add(DateBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 334, -1, -1));

        CalenderHomeLBL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CalenderHomeLBL.setText("Calender");
        HomePNL.add(CalenderHomeLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 12, -1, -1));
        HomePNL.add(CalenderMainLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 48, 253, 107));

        ReminderBCKRND2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ztjam\\OneDrive - National College of Ireland\\Documents\\Year 2\\Teams project\\MAMApp\\build\\classes\\mamapp\\FinalImage_5.png")); // NOI18N
        HomePNL.add(ReminderBCKRND2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        jTabbedPane1.addTab("Home", HomePNL);

        RemindersPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLBL.setText("MAM");
        RemindersPNL.add(TitleLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        InfoLBL.setText("Please enter how many minutes from now you would like a reminder.");
        RemindersPNL.add(InfoLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        WaterLBL.setText("Water Reminder");
        RemindersPNL.add(WaterLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 74, -1, -1));
        RemindersPNL.add(WaterTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 72, 347, -1));
        RemindersPNL.add(StretchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 109, 347, -1));

        StretchLBL.setText("Stretch Reminder");
        RemindersPNL.add(StretchLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 111, -1, -1));

        BreakLBL.setText("Break reminder");
        RemindersPNL.add(BreakLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 142, -1, -1));
        RemindersPNL.add(BreakTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 140, 347, -1));

        ConfirmBTN.setText("Confirm");
        ConfirmBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBTNActionPerformed(evt);
            }
        });
        RemindersPNL.add(ConfirmBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 304, -1, -1));

        ReminderBCKRND.setIcon(new javax.swing.ImageIcon("C:\\Users\\ztjam\\OneDrive - National College of Ireland\\Documents\\Year 2\\Teams project\\MAMApp\\build\\classes\\mamapp\\FinalImage_5.png")); // NOI18N
        RemindersPNL.add(ReminderBCKRND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        jTabbedPane1.addTab("Reminders", RemindersPNL);

        CalenderPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Day1TF.setText("Day 1-");
        Day1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day1TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, 150, 39));

        Day8TF.setText("Day 8-");
        Day8TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day8TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day8TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 21, 150, 39));

        Day15TF.setText("Day 15-");
        CalenderPNL.add(Day15TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 21, 150, 39));

        Day22TF.setText("Day 22-");
        CalenderPNL.add(Day22TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 22, 170, 38));

        Day2TF.setText("Day 2-");
        CalenderPNL.add(Day2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 72, 150, 39));

        Day9TF.setText("Day 9-");
        Day9TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day9TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day9TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 72, 150, 39));

        Day16TF.setText("Day 16-");
        CalenderPNL.add(Day16TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 72, 150, 39));

        Day23TF.setText("Day 23-");
        CalenderPNL.add(Day23TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 73, 170, 38));

        Day3TF.setText("Day 3-");
        CalenderPNL.add(Day3TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, 150, 39));

        Day10TF.setText("Day 10-");
        Day10TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day10TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day10TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 123, 150, 39));

        Day17TF.setText("Day 17-");
        CalenderPNL.add(Day17TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 123, 150, 39));

        Day24TF.setText("Day 24-");
        CalenderPNL.add(Day24TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 124, 170, 38));

        Day4TF.setText("Day 4-");
        CalenderPNL.add(Day4TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 174, 150, 39));

        Day11TF.setText("Day 11-");
        Day11TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day11TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day11TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 174, 150, 39));

        Day18TF.setText("Day 18-");
        CalenderPNL.add(Day18TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 174, 150, 39));

        Day25TF.setText("Day 25-");
        CalenderPNL.add(Day25TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 175, 170, 38));

        Day5TF.setText("Day 5-");
        CalenderPNL.add(Day5TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, 150, 39));

        Day12TF.setText("Day 12-");
        Day12TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day12TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day12TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 225, 150, 39));

        Day19TF.setText("Day 19-");
        CalenderPNL.add(Day19TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 225, 150, 39));

        Day26TF.setText("Day 26-");
        CalenderPNL.add(Day26TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 226, 170, 38));

        Day6TF.setText("Day 6-");
        Day6TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day6TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day6TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 276, 150, 39));

        Day13TF.setText("Day 13-");
        Day13TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day13TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day13TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 276, 150, 39));

        Day20TF.setText("Day 20-");
        CalenderPNL.add(Day20TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 276, 150, 39));

        Day27TF.setText("Day 27-");
        CalenderPNL.add(Day27TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 277, 170, 38));

        Day7TF.setText("Day 7-");
        CalenderPNL.add(Day7TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 327, 150, 39));

        Day14TF.setText("Day 14-");
        Day14TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day14TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day14TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 327, 150, 39));

        Day21TF.setText("Day 21-");
        Day21TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day21TFActionPerformed(evt);
            }
        });
        CalenderPNL.add(Day21TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 327, 150, 39));

        Day28TF.setText("Day 28-");
        CalenderPNL.add(Day28TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 328, 170, 38));

        SaveBTN.setText("Save");
        SaveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBTNActionPerformed(evt);
            }
        });
        CalenderPNL.add(SaveBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 372, -1, -1));

        Week1LBL.setText("Week 1");
        CalenderPNL.add(Week1LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 0, -1, -1));

        Week2LBL.setText("Week 2");
        CalenderPNL.add(Week2LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, -1, -1));

        Week3LBL.setText("Week 3");
        CalenderPNL.add(Week3LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 0, -1, -1));

        Week4LBL.setText("Week 4");
        CalenderPNL.add(Week4LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 0, -1, -1));

        ReadBTN.setText("Read");
        ReadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadBTNActionPerformed(evt);
            }
        });
        CalenderPNL.add(ReadBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 372, -1, -1));

        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });
        CalenderPNL.add(DeleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 372, -1, -1));

        ReminderBCKRND1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ztjam\\OneDrive - National College of Ireland\\Documents\\Year 2\\Teams project\\MAMApp\\build\\classes\\mamapp\\FinalImage_5.png")); // NOI18N
        CalenderPNL.add(ReminderBCKRND1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        jTabbedPane1.addTab("Calender", CalenderPNL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBTNActionPerformed
        
       
             
        timer2 t = new timer2();
        timer m = new timer();
        timer3 q = new timer3();
         
      
        
        try{
            m.setBreakNo(Integer.parseInt(BreakTF.getText()));
            m.setStretchNo(Integer.parseInt(StretchTF.getText()));
            m.setWaterNo(Integer.parseInt(WaterTF.getText()));
            t.setBreakNo(Integer.parseInt(BreakTF.getText()));
            t.setStretchNo(Integer.parseInt(StretchTF.getText()));
            t.setWaterNo(Integer.parseInt(WaterTF.getText()));
            q.setBreakNo(Integer.parseInt(BreakTF.getText()));
            q.setStretchNo(Integer.parseInt(StretchTF.getText()));
            q.setWaterNo(Integer.parseInt(WaterTF.getText()));

            JOptionPane.showMessageDialog(null,"Minutes before water Break: " + m.WaterNo + "\n" + "Minutes before Stretch Break: " + m.StretchNo + "\n" + "Minutes before main Break: " + m.BreakNo );
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Please enter a valid integer.");
        }

        m.newWaterNo = m.WaterNo*60;
        t.newBreakNo = t.BreakNo*60;
        q.newStretchNo = q.StretchNo*60;

         String y = JOptionPane.showInputDialog("How many repeats would you like?");
                  i = Integer.parseInt(y);
      
        t.timer2.scheduleAtFixedRate(t.task2,1000,1000);
        if (i>0) {
        m.timer.scheduleAtFixedRate(m.task,1000,1000);
        MAMGUI.i--;
        }
        q.timer3.scheduleAtFixedRate(q.task3,1000,1000);
        
       
         
        
    }//GEN-LAST:event_ConfirmBTNActionPerformed

    private void Day8TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day8TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day8TFActionPerformed

    private void Day9TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day9TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day9TFActionPerformed

    private void Day10TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day10TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day10TFActionPerformed

    private void Day11TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day11TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day11TFActionPerformed

    private void Day12TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day12TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day12TFActionPerformed

    private void Day13TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day13TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day13TFActionPerformed

    private void Day14TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day14TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day14TFActionPerformed

    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
         
         Calender f = new Calender();
            f.setCalender1(Day1TF.getText());
            f.setCalender2(Day2TF.getText());
            f.setCalender3(Day3TF.getText());
            f.setCalender4(Day4TF.getText());
            f.setCalender5(Day5TF.getText());
            f.setCalender6(Day6TF.getText());
            f.setCalender7(Day7TF.getText());
            f.setCalender8(Day8TF.getText());
            f.setCalender9(Day9TF.getText());
            f.setCalender10(Day10TF.getText());
            f.setCalender11(Day11TF.getText());
            f.setCalender12(Day12TF.getText());
            f.setCalender13(Day13TF.getText());
            f.setCalender14(Day14TF.getText());
            f.setCalender15(Day15TF.getText());
            f.setCalender16(Day16TF.getText());
            f.setCalender17(Day17TF.getText());
            f.setCalender18(Day18TF.getText());
            f.setCalender19(Day19TF.getText());
            f.setCalender20(Day20TF.getText());
            f.setCalender21(Day21TF.getText());
            f.setCalender22(Day22TF.getText());
            f.setCalender23(Day23TF.getText());
            f.setCalender24(Day24TF.getText());
            f.setCalender25(Day25TF.getText());
            f.setCalender26(Day26TF.getText());
            f.setCalender27(Day27TF.getText());
            f.setCalender28(Day28TF.getText());
            
            
            calender.add(f);
        
        try {
      FileWriter myWriter = new FileWriter("MAMcalender.txt");
       for (int i = 0; i < calender.size(); i++) {
            MAM w = calender.get(i);
      myWriter.write(f.getDetails());
       }
      myWriter.close();
      JOptionPane.showMessageDialog(null,"Successfully wrote to the file.");
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null,"An error occurred.");
      e.printStackTrace();
    
        }
    }//GEN-LAST:event_SaveBTNActionPerformed

    private void HealthBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthBTNActionPerformed
       
       
        
        Collections.shuffle( health );
      // https://www.javacodeexamples.com/java-arraylist-get-random-elements-example/971
      //For loop for the display of a entry on the list. Can be changed for multiple results instead of 1 random item
       for (int i = 0; i < 1; i++) {
            MAM e = health.get(i);
            JOptionPane.showMessageDialog(null, e.getAdvices());
        }
                
    }//GEN-LAST:event_HealthBTNActionPerformed

    private void ReadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadBTNActionPerformed
      
             try {
                 String y = JOptionPane.showInputDialog("What Day would you like to read? (1-28)");
                 int n = Integer.parseInt(y);
                 
                  String line = Files.readAllLines(Paths.get("MAMcalender.txt")).get(n);
                 
                  JOptionPane.showMessageDialog(null, line );
                 
                 
             } catch (IOException ex) {
                 Logger.getLogger(MAMGUI.class.getName()).log(Level.SEVERE, null, ex);
             }
        
    }//GEN-LAST:event_ReadBTNActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
             String FILE_PATH = "C:\\Users\\ztjam\\OneDrive - National College of Ireland\\Documents\\Year 2\\Teams project\\MAMApp\\MAMcalender.txt";
             try {
                 new FileWriter(FILE_PATH, false).close();
             } catch (IOException ex) {
                 Logger.getLogger(MAMGUI.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void Day1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day1TFActionPerformed

    private void DateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateBTNActionPerformed
        try {
                 Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("dd");  
                String strDate = dateFormat.format(date); 
            
                 int n = Integer.parseInt(strDate);
                 
                  String line = Files.readAllLines(Paths.get("MAMcalender.txt")).get(n);
                 
                 
                  CalenderMainLBL.setText ( line );
                 
             } catch (IOException ex) {
                 Logger.getLogger(MAMGUI.class.getName()).log(Level.SEVERE, null, ex);
             } 
    }//GEN-LAST:event_DateBTNActionPerformed

    private void Day6TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day6TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day6TFActionPerformed

    private void Day21TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day21TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day21TFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAMGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BreakGRP;
    private javax.swing.JLabel BreakLBL;
    public static javax.swing.JLabel BreakRemaining;
    private javax.swing.JLabel BreakRemainingLBL;
    private javax.swing.JTextField BreakTF;
    private javax.swing.JLabel CalenderHomeLBL;
    private javax.swing.JLabel CalenderMainLBL;
    private javax.swing.JPanel CalenderPNL;
    private javax.swing.JButton ConfirmBTN;
    private javax.swing.JButton DateBTN;
    private javax.swing.JTextField Day10TF;
    private javax.swing.JTextField Day11TF;
    private javax.swing.JTextField Day12TF;
    private javax.swing.JTextField Day13TF;
    private javax.swing.JTextField Day14TF;
    private javax.swing.JTextField Day15TF;
    private javax.swing.JTextField Day16TF;
    private javax.swing.JTextField Day17TF;
    private javax.swing.JTextField Day18TF;
    private javax.swing.JTextField Day19TF;
    public static javax.swing.JTextField Day1TF;
    private javax.swing.JTextField Day20TF;
    private javax.swing.JTextField Day21TF;
    private javax.swing.JTextField Day22TF;
    private javax.swing.JTextField Day23TF;
    private javax.swing.JTextField Day24TF;
    private javax.swing.JTextField Day25TF;
    private javax.swing.JTextField Day26TF;
    private javax.swing.JTextField Day27TF;
    private javax.swing.JTextField Day28TF;
    private javax.swing.JTextField Day2TF;
    private javax.swing.JTextField Day3TF;
    private javax.swing.JTextField Day4TF;
    private javax.swing.JTextField Day5TF;
    private javax.swing.JTextField Day6TF;
    private javax.swing.JTextField Day7TF;
    private javax.swing.JTextField Day8TF;
    private javax.swing.JTextField Day9TF;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton HealthBTN;
    private javax.swing.JPanel HomePNL;
    private javax.swing.JLabel HomeTimerLBL;
    private javax.swing.JLabel InfoLBL;
    private javax.swing.JButton ReadBTN;
    private javax.swing.JLabel RemainingtimeStretchLBL;
    private javax.swing.JLabel ReminderBCKRND;
    private javax.swing.JLabel ReminderBCKRND1;
    private javax.swing.JLabel ReminderBCKRND2;
    private javax.swing.ButtonGroup ReminderGRP;
    private javax.swing.JPanel RemindersPNL;
    private javax.swing.JButton SaveBTN;
    private javax.swing.ButtonGroup StretchGRP;
    private javax.swing.JLabel StretchLBL;
    public static javax.swing.JLabel StretchRemaining;
    private javax.swing.JTextField StretchTF;
    private javax.swing.JLabel TitleLBL;
    private javax.swing.ButtonGroup WaterGRP;
    private javax.swing.JLabel WaterLBL;
    public static javax.swing.JLabel WaterRemaining;
    private javax.swing.JLabel WaterRemainingLBL;
    private javax.swing.JTextField WaterTF;
    private javax.swing.JLabel Week1LBL;
    private javax.swing.JLabel Week2LBL;
    private javax.swing.JLabel Week3LBL;
    private javax.swing.JLabel Week4LBL;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}




// References
// https://www.w3schools.com/java/java_files_read.asp - file reading
//https://www.javatpoint.com/java-get-current-date - current date 
//
//
//
//
//
//
//
//