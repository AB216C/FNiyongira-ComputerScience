from flask import Flask, request, jsonify

app = Flask(__name__)

## Adding the end pont down for the green test. 2nd Tet
@app.route('/sum', methods= ['POST'])

#GREEN TEST: CREATE CODE FOR THE END POINT TO PASS THE TEST-Functionality added
# def sum():
#     data = request.get_json()
#     num1 = data.get('num1')
#     num2 = data.get('num2')
#     result = num1 + num2
#     return jsonify({'result': result} )

# REFACTORING: CLEANING UP THE SOLUTION

# def sum():
#     data = request.get_json()
#     return jsonify({'result': data.get['num1'] + data.get['num2']})

# REFACTORING: BY ADDING ERROR HANDLING

def sum():
    data = request.get_json()
    try:
        return jsonify({'result': data['num1']+ data['num2']})

    except KeyError:
        return jsonify({'error': 'Missing properties num1 or/and num2'}),400

if __name__ == "__main__":
    app.run(debug=True)