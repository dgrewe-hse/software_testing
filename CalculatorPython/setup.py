# Copyright (c) 2024. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
#nder the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.  
#
# This code is distributed for educational purposes only, but WITHOUT
# ANY WARRANTY; See the GNU General Public License version 3 for more 
# details (a copy is included in the LICENSE file that
# accompanied this code).
from setuptools import setup, find_packages

# Package metadata
setup(
    name="CalculatorPython",  # projectName
    version="1.0.0",           # project version
    description="A simple calculator application with addition and multiplication functions.",
    author="Dennis Grewe",
    author_email="dennis.grewe@hs-esslingen.de",
    packages=find_packages(),  # Automatically finds all packages (e.g., calculator.py)
    
    # Include the dependencies required for your project
    install_requires=[
        "pytest==7.2.2",          # Add pytest for testing
        "nose2==0.11.0",          # Use nose2 instead of nose
        "rednose==1.3.0",         # For colorful output in the tests
        "nose-progressive==1.5.2" # For showing a progress bar during tests
    ],

    # For running tests using pytest, nose2, and additional nose plugins
    test_suite="nose2.collector.collector",
    tests_require=["pytest", "nose2", "rednose", "nose-progressive"],

    # Optional: Include additional metadata
    classifiers=[
        "Programming Language :: Python :: 3",  # Python 3 support
        "License :: OSI Approved :: MIT License",  # License
        "Operating System :: OS Independent",  # OS compatibility
    ],
    
    # Optional: Automatically include all .txt and other files
    include_package_data=True,
)