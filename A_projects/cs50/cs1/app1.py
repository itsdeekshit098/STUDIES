from flask import Flask, render_template,request

app = Flask(__name__)

@app.route('/')
def x():
    
    return render_template("index1.html")

@app.route('/hello/<name>')   
def hello_name(name): 
    print("hello %s" %name)
    #return render_template("index.html",abc=name)
    return" hello %s" %name

if __name__ == "__main__":
    app.run(debug=True)
