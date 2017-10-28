# Calculator-Android
Calculator app HW6


Breakdown of the teamworks:
Fransisco - Design, try catches, Parentheses Functions and fixes errors
Yoki- Library, Half of the Scientific functions, Read-Me
Amar- Functionality of the vertical
Murrod- Half of the Scientific function

----------------------------------------------------------------------------------------
                           Breakdown of the Calculator 
----------------------------------------------------------------------------------------

Library: MathJS Android for scientific functions

Dependency included in the build.gradle(Module.app)
Included Repositories maven in build.gradle(Project)
-----------------------------------------------------

MainActivity
-Defined all the buttons and connected to their id from the resources layout.
-SetOnClickListener for the vertical view buttons, the landscape view onClick was set in the resources layout.
-Override onCLick method with a switch statement that when a button is click, base on its button's id, it will show it on TextView.
-For the equal button, we have a try catch method for DuktapeException that runs the MathJS' computation and spit it back out on the TextView.

Drawable
-RoundedButton.xml, the design for the buttons.

Activity_main.xml Resources
-Design all the buttons for the basic calculator functions with its ids.

Activity_main.xml (landscape)
-Includes all the scientific functions buttons along with its ids and layout design.

-------------------------------------------------------------------------------------------
