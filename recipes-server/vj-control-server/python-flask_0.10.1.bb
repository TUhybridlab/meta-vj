DESCRIPTION = ""
HOMEPAGE = ""
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=79aa8b7bc4f781210d6b5c06d6424cb0"
DEPENDS = "python-werkzeug"

RDEPENDS_${PN} = "python-werkzeug \
                  "

SRCNAME = "Flask"

SRC_URI = "\
          https://pypi.python.org/packages/source/F/Flask/Flask-${PV}.tar.gz \
          "
SRC_URI[md5sum] = "378670fe456957eb3c27ddaef60b2b24"
SRC_URI[sha256sum] = "4c83829ff83d408b5e1d4995472265411d2c414112298f2eb4b359d9e4563373"

S = "${WORKDIR}/${SRCNAME}-${PV}"

# Package Revision, Update this whenever you change the recipe.
PR = "r2"

inherit setuptools
