package Palindrome;

public class PalindromeTest {
    public static void main(String[] args) {

        PalindromeTest x = new PalindromeTest();
        System.out.println( x.isPalindrome("molom"));
    }
    public boolean isPalindrome(String str){

        String name ="";
        for (int i = str.length() -1; i >= 0 ; i--) {
            name = name + str.charAt(i);
        }
        if(name.equals(str)){
            return true;
        }else {
            return false;
        }

    }
    }

    /*
    package Palindrome; // একটি প্যাকেজ তৈরি করা হয়েছে যার নাম "Palindrome"
// প্যাকেজ হল কোডের একটি গ্রুপ যা একসাথে রাখা হয়।

public class PalindromeTest { // একটি পাবলিক ক্লাস তৈরি করা হয়েছে যার নাম "PalindromeTest"
// ক্লাস হল প্রোগ্রামের একটি অংশ যেখানে বিভিন্ন মেথড এবং ভ্যারিয়েবল রাখা হয়।

    public static void main(String[] args) { // মেইন মেথড হল প্রোগ্রামের শুরু করার জায়গা
    // যখনই আমরা প্রোগ্রাম রান করি, এই মেথড থেকেই শুরু হয়।

        PalindromeTest x = new PalindromeTest(); // PalindromeTest ক্লাসের একটি নতুন অবজেক্ট তৈরি করা হয়েছে, যার নাম x
        // অবজেক্ট হল ক্লাসের একটি নির্দিষ্ট উদাহরণ যা ক্লাসের সমস্ত ফিচার ব্যবহার করতে পারে।

        System.out.println(x.isPalindrome("molom")); // isPalindrome মেথড কল করে "molom" স্ট্রিংটি প্যালিনড্রোম কিনা তা প্রিন্ট করা হয়
        // "System.out.println" ব্যবহার করে আমরা কনসোলে কোন কিছু প্রিন্ট করতে পারি।
    }

    public boolean isPalindrome(String str){ // isPalindrome নামে একটি মেথড তৈরি করা হয়েছে যা স্ট্রিং ইনপুট নেয় এবং ট্রু বা ফলস রিটার্ন করে
    // মেথড হল এমন কিছু কোড যা একটি নির্দিষ্ট কাজ সম্পন্ন করে।

        String name =""; // একটি খালি স্ট্রিং ভ্যারিয়েবল তৈরি করা হয়েছে যার নাম "name"
        // স্ট্রিং হল অক্ষরের একটি সিকোয়েন্স।

        for (int i = str.length() -1; i >= 0 ; i--) { // একটি ফর লুপ যা স্ট্রিং এর শেষ অক্ষর থেকে শুরু করে প্রথম অক্ষর পর্যন্ত চলে
        // লুপ ব্যবহার করে আমরা একই কাজ বারবার করতে পারি।

            name = name + str.charAt(i); // প্রতিটি অক্ষরকে উল্টো করে "name" স্ট্রিং এর সাথে যোগ করা হচ্ছে
            // "charAt(i)" স্ট্রিং এর i তম অবস্থানের অক্ষরটি নেয়।
        }

        if(name.equals(str)){ // যদি "name" এবং মূল "str" স্ট্রিং সমান হয়, তবে প্যালিনড্রোম
        // "equals" মেথড ব্যবহার করে আমরা দুটি স্ট্রিং সমান কিনা তা চেক করি।

            return true; // যদি সমান হয়, তবে ট্রু রিটার্ন করা হয়
        } else {
            return false; // যদি সমান না হয়, তবে ফলস রিটার্ন করা হয়
        }
    }
}
এখন প্রতিটি লাইন কি কাজ করছে তা সহজ ভাষায় ব্যাখ্যা করা হলো:

package Palindrome;

এটি একটি প্যাকেজ তৈরি করে যা প্রোগ্রামিং কোডকে একসাথে সংগঠিত করে।
public class PalindromeTest {

এখানে একটি ক্লাস তৈরি করা হয়েছে যা প্রোগ্রামের বিভিন্ন মেথড এবং ভ্যারিয়েবলকে ধারণ করে।
public static void main(String[] args) {

মেইন মেথড হল সেই জায়গা যেখান থেকে প্রোগ্রাম শুরু হয়।
PalindromeTest x = new PalindromeTest();

PalindromeTest ক্লাসের একটি নতুন অবজেক্ট তৈরি করা হয়েছে, যার নাম x।
System.out.println(x.isPalindrome("molom"));

এটি কনসোলে "molom" স্ট্রিংটি প্যালিনড্রোম কিনা তা প্রিন্ট করে।
public boolean isPalindrome(String str){

একটি মেথড যা স্ট্রিং ইনপুট নেয় এবং সেই স্ট্রিংটি প্যালিনড্রোম কিনা তা চেক করে।
String name ="";

একটি খালি স্ট্রিং ভ্যারিয়েবল তৈরি করা হয়েছে যার নাম "name"।
for (int i = str.length() -1; i >= 0 ; i--) {

একটি লুপ যা স্ট্রিংটির শেষ অক্ষর থেকে শুরু করে প্রথম অক্ষর পর্যন্ত চলে।
name = name + str.charAt(i);

স্ট্রিংটির প্রতিটি অক্ষরকে উল্টো করে "name" স্ট্রিং এ যোগ করা হচ্ছে।
if(name.equals(str)){

চেক করা হচ্ছে "name" এবং "str" স্ট্রিং দুটি সমান কিনা।
return true;

যদি সমান হয়, তবে ট্রু রিটার্ন করা হচ্ছে।
return false;

যদি সমান না হয়, তবে ফলস রিটার্ন করা হচ্ছে।
এভাবে, কোডটি একটি স্ট্রিং প্যালিনড্রোম কিনা তা যাচাই করে।
     */

