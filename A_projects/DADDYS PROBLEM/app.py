import sqlite3 
from flask import FLASK,render_template,request

app=Flask(__name__)
db_file = 'mydatabase.db'
@app.route("/")
def enter_details():
    return render_template("details.html")
@app.route("/submit")
def submit():
    name=request.form.get["nameofdriver"]
    vehicle_number=request.form.get["vehicle_number"]
    # Connect to SQLite database
    with sqlite3.connect(db_file) as conn:
        cursor = conn.cursor()

        # Create table if it doesn't exist
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS users (
                name TEXT,
                email TEXT
            )
        ''')

        # Insert data into users table
        cursor.execute("INSERT INTO users (name, email) VALUES (?, ?)", (name, email))
        conn.commit()

    return redirect('/') 





    return render_template("results.html",n=name,v=vehicle_number)


