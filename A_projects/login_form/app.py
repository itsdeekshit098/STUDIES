from flask import Flask,render_template,request,url_for
import mysql.connector

app=Flask(__name__)

database_connection={
    "username":"root",
    "hostname":"127.0.0.1",
    "password":"sql@hansi123mgp",
    "database":"login"
}

def connection():
    return sql.connector.connect(**database_connection)

@app.route("/")
def home():
    return render_template("login.html")

@app.route("/index",methods=["POST"])
def index():
    mail=request.form.get("email")
    passwd=request.form.get("passwd")
    return render_template("index.html",mail=mail,passwd=passwd)