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
    connection=conn()
    cursor=connection.cursor(dictionary=True)
    query1="SELECT * FROM todo"
    cursor.execute(query1)
    details=cursor.fetchall()
    #print("from index function")
    print(details)
    cursor.close()
    connection.close()
    return render_template("index.html",tasks=details)

@app.route("/addtask",methods=['POST','GET'])
def addtask():
    a1=request.form.get("task")
    print("form addtask() function")
    print("a1 value")
    print(f"a1 value: {a1}")
    print('length of a1',len(a1))
    print("length of a1.strip",len(a1.strip()))

    if len(a1.strip())==0:
        print("from if of add_taks() function")
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
        print("else of the addtask() function")
        return redirect(url_for('index'))      


@app.route("/delete/<int:task_id>",methods=["GET","POST"])
def deleteabcc(task_id):
    id_no=task_id
    connection=conn()
    cursor=connection.cursor()
    sql="DELETE FROM todo WHERE id=%s"
    values=(id_no,)
    cursor.execute(sql,values)
    connection.commit()
    cursor.close()
    connection.close()
    return redirect(url_for('index'))