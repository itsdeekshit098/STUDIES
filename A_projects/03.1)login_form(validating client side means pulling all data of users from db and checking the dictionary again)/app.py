from flask import Flask,render_template,request,url_for
import mysql.connector

app=Flask(__name__)

database_connection={
    "username":"root",
    "host":"127.0.0.1",
    "password":"sql@hansi123mgp",
    "database":"login"
}

def connection():
    return mysql.connector.connect(**database_connection)

@app.route("/")
def home():
    return render_template("login.html")

# @app.route("/index",methods=["POST"])
# def index():
#     mail=request.form.get("email")
#     passwd=request.form.get("passwd")
#     return render_template("index.html",mail=mail,passwd=passwd)

@app.route("/display",methods=["POST","GET"])
def display():
    mail=request.form.get("email")
    passwd=request.form.get("passwd")
    conn=connection()
    cursor=conn.cursor(dictionary=True)
    query="SELECT * FROM login"
    cursor.execute(query)
    records=cursor.fetchall()
    print(records)
    cursor.close()
    conn.close()
    for i in records:
        if i["username"]==mail and i["password"]==passwd:
            return render_template("index.html",id=i["userid"])
    return render_template("invalid.html")
            
    
                
    

