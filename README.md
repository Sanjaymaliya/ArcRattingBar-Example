# ArcRattingBar-Example
# Preview
![alt text](https://github.com/Sanjaymaliya/ArcRattingBar-Example/blob/master/app/src/main/res/drawable/screenshot_1.png)

# 
# Integration

      allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
     }
    dependencies {
        implementation 'com.github.Sanjaymaliya:ArcRatingBar:1.0'
    }
     
     
# Usage

        <com.maliyabrothers.arcrattingbar.ArcRatingBar
              android:id="@+id/ratingBar"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              app:selectImage="@drawable/star_checked"
              app:unSelectImage="@drawable/star_unchecked"
              app:star="1" />
              
# In Your Code
  
          ratingBar.getStars()
          
          ratingBar.setStar()
