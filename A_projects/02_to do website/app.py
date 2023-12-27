from flask import Flask,render_template,request,redirect,url_for
import mysql.connector

app=Flask(__name__)

db_config={
    "host":"127.0.0.1",
    "username":"root",
    "password":"sql@hansi123mgp",
    "database":"todo"
}

def conn():
    return mysql.connector.connect(**db_config)


@app.route("/")
def index():
    return render_template("index.html")

@app.route("/addtask",methods=['POST','GET'])
def addtask():
    a1=request.form.get("task")
    if a1 is None:
        return render_template("error1.html")
    else:
        a=request.form.get("task")
        connection=conn()
        cursor=connection.cursor()
        query="INSERT INTO todo(value) VALUES(%s)"
        data=(a,)
        cursor.execute(query,data)
        connection.commit()
        connection.rollback()
        cursor.close()
        connection.close()  
    return redirect(url_for('display'))      


@app.route("/display")   
def display():
    connection=conn()
    cursor=connection.cursor(dictionary=True)
    query1="SELECT * FROM todo"
    cursor.execute(query1)
    details=cursor.fetchall()
    print(details)
    cursor.close()
    connection.close()
    return render_template('display.html',tasks = details)

        