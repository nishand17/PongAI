{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 To run the file:\
\
Open command line/terminal inside this directory and type the following:\
\
	If on Mac:\
\
		bash mac_run.sh\
\
	If on Windows:\
\
		windows_run.bat\
\
To change bots, open the .sh/.bat file in Sublime. On the first line (starts with \'91javac\'92),\
change jBerney/*.java to whatever your file is called.\
\
Example: My file is called PongBot.java and it is located in the pong folder. The first line of my .sh/.bat file would read: javac PongBog.java\
\
If you put your bot file in a folder, please add this line to the top of your .java file:\
\
	package folder_name;\
\
where folder_name is the name of the folder the .java file is located in.\
}