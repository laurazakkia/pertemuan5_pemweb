from flask import Flask, render_template, request

app = Flask(__name__)

# Data portofolio
portfolio_data = {
    "nama": "Ismi Laura Azakkiyyah",
    "profesi": "Information Systems Student",
    "universitas": "State Islamic University of Sunan Ampel Surabaya",
    "menu": ["Home", "About", "Contact"],
    "about": {
        "title": "Get to Know Me!",
        "description": [
            "I am an Information Systems student who is currently studying and trying to understand the world of Technology. Currently, my knowledge is still limited, but I am very excited to explore and learn more about this world.",
            "During these four semesters of college, I have worked on various project assignments that I share on GitHub. My goal is to document my experiences and open up a space to discuss with others in this field.",
            "I am open to discussing, learning, and contributing. If you have an opportunity that fits my interests and skills, please contact me."
        ],
        "image": "laura1.jpg"  # Add your profile image file name
    },
    "contact": {
        "title": "Contact",
        "github": {
            "link": "https://github.com/laurazakkia"
        },
        "instagram": {
            "link": "https://instagram.com/laura.zakkia"
        },
        "email": {
            "address": "laurazakkia12@gmail.com"
        }
    }
}

@app.route('/')
def home():
    return render_template('index.html', data=portfolio_data)

@app.route('/about')
def about():
    return render_template('about.html', data=portfolio_data)

@app.route('/contact')
def contact():
    return render_template('contact.html', data=portfolio_data)

if __name__ == '__main__':
    app.run(debug=True)