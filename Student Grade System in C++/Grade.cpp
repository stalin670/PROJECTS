#include<bits/stdc++.h>
using namespace std;

struct Student {
    string name;
    int id;
    double grade;
};

// Function to add a new student record to the gradebook
void addRecord(vector<Student> &gradebook) {
    Student newStudent;
    cout << "Enter student name: ";
    cin >> newStudent.name;
    cout << "Enter student ID: ";
    cin >> newStudent.id;
    cout << "Enter student grade: ";
    cin >> newStudent.grade;

    gradebook.push_back(newStudent);
    cout << "Student record added successfully.\n";
}

// Function to search for a student using linear search
void searchStudent(const vector<Student> &gradebook, int id) {
    bool found = false;
    for (const auto &student : gradebook) {
        if (student.id == id) {
            cout << "Student found!\n";
            cout << "Name: " << student.name << "\n";
            cout << "ID: " << student.id << "\n";
            cout << "Grade: " << student.grade << "\n";
            found = true;
            break;
        }
    }
    if (!found) {
        cout << "Student not found.\n";
    }
}

// Function to update grades of a particular student
void updateGrade(vector<Student> &gradebook, int id, double newGrade) {
    for (auto &student : gradebook) {
        if (student.id == id) {
            student.grade = newGrade;
            cout << "Grade updated successfully.\n";
            return;
        }
    }
    cout << "Student ID not found. Grade not updated.\n";
}

// Function to delete a record of a particular student
void deleteRecord(vector<Student> &gradebook, int id) {
    auto it = gradebook.begin();
    while (it != gradebook.end()) {
        if (it->id == id) {
            it = gradebook.erase(it);
            cout << "Student record deleted successfully.\n";
            return;
        } else {
            ++it;
        }
    }
    cout << "Student ID not found. Record not deleted.\n";
}

// Function to print all student records
void printAllRecords(vector<Student> gradebook){
    if(gradebook.size()==0){
      cout << "No Records are present" << "\n";
      return;
    }
    cout<<"\n";
    for(auto student:gradebook){
      cout << "Name: " << student.name << "\n";
      cout << "ID: " << student.id << "\n";
      cout << "Grade: " << student.grade << "\n";
      cout<<"\n";
    }
}

int main() {
    vector<Student> gradebook;
    int choice, id;
    double newGrade;

    do {
        cout << "\nStudent Gradebook Menu:\n";
        cout << "1. Add a new record\n";
        cout << "2. Search for a student\n";
        cout << "3. Update student grade\n";
        cout << "4. Delete a student record\n";
        cout << "5. Print all records\n";
        cout << "6. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                addRecord(gradebook);
                break;
            case 2:
                cout << "Enter student ID to search: ";
                cin >> id;
                searchStudent(gradebook, id);
                break;
            case 3:
                cout << "Enter student ID to update grade: ";
                cin >> id;
                cout << "Enter new grade: ";
                cin >> newGrade;
                updateGrade(gradebook, id, newGrade);
                break;
            case 4:
                cout << "Enter student ID to delete record: ";
                cin >> id;
                deleteRecord(gradebook, id);
                break;
            case 5:
                printAllRecords(gradebook);
                break;
            case 6:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice. Please enter a valid option.\n";
        }
    } while (choice != 6);

    return 0;
}
