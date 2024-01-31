from flask import Flask, render_template, redirect

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/add-to-calendar', methods=['POST'])
def add_to_calendar():
    # Google Calendar event link with default date and time
    cal_link = "https://www.google.com/calendar/render?action=TEMPLATE&text=Event+Title&dates=20240119T125000Z/20240119T135000Z"

    return redirect(cal_link)

if __name__ == '__main__':
    app.run(debug=True)
