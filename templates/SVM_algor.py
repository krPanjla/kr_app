import numpy as np
x=np.array([[-1,1],[-2,-1],[1,1],[1,2]])
y=np.array([2,4,5,6])

from sklearn.svm import SVC
clf=SVC()
clf.fit(x,y)
print(clf.predict([[-2.5,0.5]]))
