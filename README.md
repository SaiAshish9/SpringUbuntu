sudo apt update <br/>
sudo apt-cache search tomcat <br/>
sudo apt install tomcat9 tomcat9-admin <br/>
ss -ltn <br/>
sudo systemctl enable tomcat9 <br/>
sudo systemctl disable tomcat9 <br/>
sudo ufw allow from any to any port 8080 proto tcp <br/>
sudo ufw deny from any to any port 8080 proto tcp <br/>

window -> preferences -> server -> runtime environment -> /usr/share/tomcat9 <br/>
ubuntu software remove -> installed -> remove <br/>

luv2code.com/downloadspring -> dist.zip 5.0.2 copy all JAR files from lib folder

java build path -> class path -> select all JAR files




