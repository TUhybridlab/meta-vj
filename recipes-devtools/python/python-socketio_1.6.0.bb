SUMMARY = "A socket.io client library."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=c4761260c9aaedcd4564fa9a893ffe83"

RDEPENDS_${PN} = "python-six \
                  python-engineio \
"

PYPI_PACKAGE = "python-socketio"

SRC_URI[md5sum] = "7f4b975c20462d764ff1086b5f52a260"
SRC_URI[sha256sum] = "8b325e095b64675b00c05ca7072f4cd1a05054058feacbb8f7003ba72c60f076" 

PR = "r2"

inherit pypi setuptools
